import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
  public void cria(InputStream inputStream, String nomeArquivo) throws Exception {

    // ler imagem

    // String image =
    // "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies_1.jpg";
    // InputStream inputStream = new URL(image).openStream();
    BufferedImage imagemOriginal = ImageIO.read(inputStream);

    // cria imagem com transparencia e novo tamanho
    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();
    int novaAltura = altura + 200;
    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    // copiar a imagem original para nova em em memoria
    Graphics graphics = novaImagem.getGraphics();
    graphics.drawImage(imagemOriginal, 0, 0, null);

    // configurar a fonte
    Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 100);
    graphics.setColor(Color.yellow);
    graphics.setFont(fonte);

    // escrever uma frase na nova imagem
    String texto = "TOPZERA";
    FontMetrics fontMetrics = graphics.getFontMetrics();
    Rectangle2D retanguloTexto = fontMetrics.getStringBounds(texto, graphics);
    int larguraTexto = (int) retanguloTexto.getWidth();
    int posicaoTextoX = (largura - larguraTexto) / 2;
    graphics.drawString(texto, posicaoTextoX, novaAltura - 80);


    // escrever a nova imagem em um arquivo
    ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
  }
}

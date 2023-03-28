import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
  public void cria() throws Exception{
    
    // ler imagem
    
    String imagePath = "img/filme.jpg";
    File image = new File(imagePath);
    BufferedImage imagemOriginal = ImageIO.read(image);
  
    //cria imagem com transparencia e novo tamanho
    
    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();
    int novaAltura = altura + 200;
    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    //copiar a imagem original para nova em em memoria

    

    //escrever uma frase 

    // escrever a nova imagem em um arquivo
  }
}

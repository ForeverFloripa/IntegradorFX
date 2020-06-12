package servico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class Recebe {
	
    public static final String SEPARADOR = ";";
    public static final String ARQUIVO = "C:\\integracao\\recebe\\produtoslista.CSV";

	public static void main(String[] args) throws IOException {
			Produto produto = new Produto();
			
			//splitando();
		try {

            List<Produto> produtos = carregaProduto();

            for(final Produto p : produtos){
                System.out.println(p.getCodigo()+", "+p.getDescricao()+", "+p.getGrupo()+", "+p.getPreco());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

		
		
	}
//
	public static List<Produto> carregaProduto() throws IOException {
		List<Produto> list = new ArrayList<Produto>(0);
		FileReader arq = new FileReader(ARQUIVO);
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		while (linha != null) {
			System.out.printf("%s\n", linha);
			linha = lerArq.readLine();
			
			if(null != linha && !"".equals(linha) ){
				Produto produto = new Produto(linha);
				list.add(produto);
				ProdutoController pc= new ProdutoController();
				pc.salvar(produto);
				
			}
		}

		return list;
	}

	
	public static void lerArquivo() throws IOException {

		System.out.println("Iniciando Importação");
		String nomeArquivo = "C:\\integracao\\recebe\\produtoslista.CSV";
		File arq = new File(nomeArquivo);

		if (arq.exists()) {
			System.out.println("arquivo existe");

			FileReader fr = new FileReader(nomeArquivo);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				
			}
			br.close();
		}
	}

	public static void splitando() throws IOException {
		File file = new File("C:\\integracao\\recebe\\produtoslista.CSV");
		String texto = new String(Files.readAllBytes(file.toPath()));
		String[] splitados = texto.split(SEPARADOR);
		for (String col : splitados) {

			System.out.print(col + "  ");
		}

	}

}

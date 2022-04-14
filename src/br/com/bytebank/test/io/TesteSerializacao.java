package br.com.bytebank.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.model.Cliente;
import br.com.bytebank.model.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setCpf("1112312");
		cliente.setNome("João");
		cliente.setProfissao("Dev");
		
		ContaCorrente cc = new ContaCorrente(16, 22);
		cc.setTitular(cliente);
		cc.deposita(1200);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}
}

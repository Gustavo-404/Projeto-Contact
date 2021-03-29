package com.gustavogabriel.backend.exemplomap;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class ExemploMap1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("alunos.csv");
			Scanner scan = new Scanner(fis);
			Map<String, List<String>> mapa = new HashMap<String, List<String>>();
			
			//le o arquivo e mapeia
			while(scan.hasNext()) {
				String linha = scan.nextLine();
				String [] dados = linha.split(";");
				String key = dados[0];
				String value = dados[1];
				List<String> lista = mapa.get(key);
				if(lista == null) {
					lista = new ArrayList<String>();
					mapa.put(key, lista);
				}
				lista.add(value);
			}
			
			//mostra o mapeamento resumido
			for(Entry<String, List<String>> entry : mapa.entrySet()) {
				System.out.printf("Lista de %s\n", entry.getKey());
				List<String> lista = entry.getValue();
				for(String s : lista) {
					System.out.printf("    - %s\n", s);
				}
				
			}
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(mapa);
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

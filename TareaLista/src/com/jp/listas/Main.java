package com.jp.listas;

import java.util.ArrayList;
import java.util.List;

import listas.perosna;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<perosna>lista = new ArrayList<perosna>();
	        lista.add(new perosna(1,"luis",20));
	        lista.add(new perosna(1,"nadiel",40));
	        lista.add(new perosna(1,"julio",25));
	        lista.add(new perosna(1,"juana",15));
	        
	        for (perosna pers :lista) {
	        	System.out.println("perosna:"+ pers.getNombre());
	        } 
	     }
	}




package br.com.alura.forum.model;

import javax.persistence.Enumerated;


public enum StatusTopico {
	
	NAO_RESPONDIDO,
	NAO_SOLUCIONADO,
	SOLUCIONADO,
	FECHADO;

}

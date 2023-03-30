package br.com.cotiinformatica.dtos;

import lombok.Data;

@Data
public class EmailMessageDTO {
	
	public String to;
    public String subject;
    public String body;

}

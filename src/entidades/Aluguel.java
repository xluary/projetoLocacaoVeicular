package entidades;

import interfaces.Cliente;
import interfaces.Veiculo;

import java.sql.Timestamp;

public record Aluguel (Veiculo veiculo, Cliente cliente, int quantDias, Timestamp timestamp){};

package c_bancoLitoral;

import java.math.BigDecimal;

public class ClienteCreditos {

	public static void main(String[] args) throws Exception {

		CreditoTipo consumo=new CreditoTipo(1,4,new BigDecimal(5000),new BigDecimal(100000),new BigDecimal(30),"Crédito de Consumo",ClienteTipoEnum.PERSONA);CreditoTipo comercial=new CreditoTipo(4,20,new BigDecimal(10000),new BigDecimal(160000),new BigDecimal(20),"Crédito Comercial",ClienteTipoEnum.COMERCIO);CreditoTipo hipotecario=new CreditoTipo(10,40,new BigDecimal(100000),new BigDecimal(5000000),new BigDecimal(10),"Crédito Hipotecario",ClienteTipoEnum.PERSONA);CreditoTipo educativo=new CreditoTipo(1,2,new BigDecimal(5000),new BigDecimal(40000),new BigDecimal(5),"Credito de Estudio",ClienteTipoEnum.PERSONA);CreditoTipo produccion=new CreditoTipo(2,3,new BigDecimal(10000),new BigDecimal(80000),new BigDecimal(20),"Credito de Produccion",ClienteTipoEnum.EMPRESA);

		Cliente raul=new Cliente("Perez","Kevin","41629219",ClienteTipoEnum.PERSONA);Cliente loDePepe=new Cliente("Lopez","Pepe","2123332",ClienteTipoEnum.COMERCIO);Cliente familiaRuiz=new Cliente("Gomez","Lucas","45222221",ClienteTipoEnum.PERSONA);Cliente kevin=new Cliente("Morel","Tamara","45233221",ClienteTipoEnum.PERSONA);Cliente roxana=new Cliente("Rosatto","Rodrigo","11429219",ClienteTipoEnum.PERSONA);Cliente mypc=new Cliente("Lopez","Manuel","31629219",ClienteTipoEnum.EMPRESA);

		Credito credito1=new Credito(2,3,consumo,raul,new Sucursal("Sucursal 1","Concordia"),new BigDecimal(50000));Credito credito2=new Credito(1,5,comercial,loDePepe,new Sucursal("Sucursal 1","Concordia"),new BigDecimal(60000));Credito credito3=new Credito(3,13,hipotecario,familiaRuiz,new Sucursal("Sucursal 1","Concordia"),new BigDecimal(140000));Credito credito4=new Credito(4,2,educativo,kevin,new Sucursal("Sucursal 1","Concordia"),new BigDecimal(10000));Credito credito5=new Credito(5,3,consumo,roxana,new Sucursal("Sucursal 1","Concordia"),new BigDecimal(30000));Credito credito6=new Credito(6,3,produccion,mypc,new Sucursal("Sucursal 2","San Salvador"),new BigDecimal(64000));

		CreditosAdmin creditosAdm=new CreditosAdmin();creditosAdm.add(credito1);creditosAdm.add(credito2);creditosAdm.add(credito3);creditosAdm.add(credito4);creditosAdm.add(credito5);creditosAdm.add(credito6);

		System.out.println("TODOS LOS CREDITOS: ");System.out.println(creditosAdm);

		System.out.println("\nCREDITOS ORDENADOS POR ORDEN NATURAL (numero): ");System.out.println("==============================================");creditosAdm.ordenar();System.out.println(creditosAdm);

		System.out.println("\nCREDITOS ORDENADOS POR CLIENTES (dni): ");System.out.println("========================================");creditosAdm.ordenar(new CreditoClienteComparator());System.out.println(creditosAdm);

		System.out.println("\nCREDITOS ORDENADOS POR TOTAL A DEVOLVER: ");System.out.println("==========================================");creditosAdm.ordenar(new CreditoTotDevolverComparator());System.out.println(creditosAdm);

		System.out.println("\ncreditosPorClienteTipo(ClienteTipoEnum tipo): ");
		System.out.println("===============================================");
		creditosAdm.creditosPorClienteTipo(ClienteTipoEnum.COMERCIO).forEach(System.out::println);

		System.out.println("\ncreditosPorCreditoTipoySucursa(CreditoTipo tipo, Sucursal sucursal)");System.out.println("===============================================");creditosAdm.creditosPorCreditoTipoySucursal(hipotecario,new Sucursal("Sucursal 1","Concordia")).forEach(System.out::println);

		System.out.println("\ncreditosInferioresA(double monto):");System.out.println("====================================");creditosAdm.creditosInferioresA(33_000).forEach(System.out::println);

		System.out.println("\ncreditosSuperioresA(double monto):");System.out.println("====================================");creditosAdm.creditosSuperioresA(33_000).forEach(System.out::println);

		System.out.println("\nDesmostrando que falla con datos erroneos: ");@SuppressWarnings("unused")
		Credito creditoErroneo=new Credito(66,33,hipotecario,mypc,new Sucursal("Sucursal 2","Villaguay"),new BigDecimal(2222));

	}
}

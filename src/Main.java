import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static String arquivoCSVFinal = "";

    public boolean main(String caminhoCsv) {
    	String csvFile = caminhoCsv;
        String line = "";
        String cvsSplitBy = ";";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] campos = line.split(cvsSplitBy);
                if(Double.parseDouble(campos[3].replace(",", ""))<0) {
                		campos[1] = getCodigoBanco(campos,csvFile);
                		arquivoCSVFinal += campos[0]+";"+campos[1]+";"+campos[2]+";"+campos[3]+";"+campos[4]+"\n";
                }else {
                		campos[2] = getCodigoBanco(campos,csvFile);
                		arquivoCSVFinal += campos[0]+";"+campos[1]+";"+campos[2]+";"+campos[3]+";"+campos[4]+"\n";
                }
                System.out.println("campos 1: "+campos[1]);
                System.out.println("campos 2: "+campos[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        try {
			FileWriter csvWriter = new FileWriter("ArquivoModificado.csv");
			csvWriter.append(arquivoCSVFinal);
			csvWriter.flush();
			csvWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
    }
    
    
	private static String getCodigoBanco(String[] campos, String csvFile) {
		if(campos[4].contains("DURATEX")) {
			if(csvFile.contains("GUSTAVO")) {
				return "683";
			}else if(csvFile.contains("VALFREDO")) {
				return "712";
			}
		}else if(campos[4].contains("DEXCO SA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "683";
			}
		}else if(campos[4].contains("ARMAZEM RIB")) {
			if(csvFile.contains("GUSTAVO")) {
				return "608";
			}else if(csvFile.contains("VALFREDO")) {
				return "4527";
			}
		}else if(campos[4].contains("STANCANELLI")) {
			if(csvFile.contains("GUSTAVO")) {
				return "610";}
		}else if(campos[4].contains("ROMETAL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "614";
			}else if(csvFile.contains("VALFREDO")) {
				return "620";
			}
		}else if(campos[4].contains("REVENDEDORA DE GAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "617";
			}
		}else if(campos[4].contains("REHAU")) {
			if(csvFile.contains("GUSTAVO")) {
				return "619";
			}else if(csvFile.contains("VALFREDO")) {
				return "626";
			}
		}else if(campos[4].contains("VONDER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "627";
			}else if(csvFile.contains("VALFREDO")) {
				return "638";
			}
		}else if(campos[4].contains("NORCOLA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "628";
			}else if(csvFile.contains("VALFREDO")) {
				return "639";
			}
		}else if(campos[4].contains("ALBRAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "633";
			}else if(csvFile.contains("VALFREDO")) {
				return "647";
			}
		}else if(campos[4].contains("MAKITA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "635";
			}else if(csvFile.contains("VALFREDO")) {
				return "654";
			}
		}else if(campos[4].contains("POSTO PINH")) {
			if(csvFile.contains("VALFREDO")) {
			return "636";}
		}else if(campos[4].contains("MIRANDA COM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "850";
			}else if(csvFile.contains("VALFREDO")) {
			return "644";}
		}else if(campos[4].contains("IBRAP")) {
			if(csvFile.contains("GUSTAVO")) {
				return "661";
			}else if(csvFile.contains("VALFREDO")) {
				return "686";
			}
		}else if(campos[4].contains("LEO MADEIRAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "671";
			}
		}else if(campos[4].contains("MADEIREIRA SANTA TER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "851";
			}
		}else if(campos[4].contains("JR COM.")) {
			if(csvFile.contains("VALFREDO")) {
			return "664";}
		}else if(campos[4].contains("GUANAMBI")) {
			if(csvFile.contains("GUSTAVO")) {
				return "666";
			}else if(csvFile.contains("VALFREDO")) {
				return "691";
			}
		}else if(campos[4].contains("INGRAM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7049";
			}else if(csvFile.contains("VALFREDO")) {
			return "685";}
		}else if(campos[4].contains("CG COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7068";
			}
		}else if(campos[4].contains("CAAD")) {
			if(csvFile.contains("GUSTAVO")) {
				return "698";
			}else if(csvFile.contains("VALFREDO")) {
				return "721";
			}
		}else if(campos[4].contains("BLACK &") || campos[4].contains("BLACK E DEC")) {
			if(csvFile.contains("GUSTAVO")) {
				return "701";
			}else if(csvFile.contains("VALFREDO")) {
				return "722";
			}
		}else if(campos[4].contains("BALDISSERA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "703";
			}else if(csvFile.contains("VALFREDO")) {
				return "726";
			}
		}else if(campos[4].contains("ARTECOLA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "704";
			}else if(csvFile.contains("VALFREDO")) {
				return "1025";
			}
		}else if(campos[4].contains("BALDAN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "852";
			}else if(csvFile.contains("VALFREDO")) {
				return "727";
			}
		}else if(campos[4].contains("BOM JESUS")) {
			if(csvFile.contains("ALFREDO")) {
			return "739";}
		}else if(campos[4].contains("VERRY")) {
			if(csvFile.contains("GUSTAVO")) {
				return "855";
			}else if(csvFile.contains("VALFREDO")) {
				return "1291";
			}
		}else if(campos[4].contains("VFS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4542";
			}
		}else if(campos[4].contains("REPLASTIL COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "864";
			}
		}else if(campos[4].contains("TORO CO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "856";}
		}else if(campos[4].contains("TECNOFRIS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "857";
			}else if(csvFile.contains("VALFREDO")) {
				return "1293";
			}
		}else if(campos[4].contains("STARRET")) {
			if(csvFile.contains("GUSTAVO")) {
				return "858";
			}else if(csvFile.contains("VALFREDO")) {
				return "1524";
			}
		}else if(campos[4].contains("SANDULA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "861";
			}else if(csvFile.contains("VALFREDO")) {
				return "1529";
			}
		}else if(campos[4].contains("PROADEC")) {
			if(csvFile.contains("GUSTAVO")) {
				return "868";
			}else if(csvFile.contains("VALFREDO")) {
				return "634";
			}
		}else if(campos[4].contains("NORDESTE COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "870";
			}
		}else if(campos[4].contains("COMERCIAL VITA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1403";
			}
		}else if(campos[4].contains("MAGNUM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "876";
			}else if(csvFile.contains("VALFREDO")) {
				return "1317";
			}
		}else if(campos[4].contains("JOMETAIS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "885";
			}else if(csvFile.contains("VALFREDO")) {
				return "1328";
			}
		}else if(campos[4].contains("JOMARCA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "886";
			}else if(csvFile.contains("VALFREDO")) {
				return "1329";
			}
		}else if(campos[4].contains("Devolu� Cheque Depositado")) {
			if(csvFile.contains("GUSTAVO")) {
				return "504";
			}
		}else if(campos[4].contains("Folha de Pagamento")) {
			if(csvFile.contains("GUSTAVO")) {
				return "187";
			}
		}else if(campos[4].contains("FGTS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "192";
			}
		}else if(campos[4].contains("IPVA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "349";
			}
		}else if(campos[4].contains("CELPE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "354";
			}
		}else if(campos[4].contains("1TELECOM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "558";
			}
		}else if(campos[4].contains("A LAYSE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "361";
			}
		}else if(campos[4].contains("ADMINISTRACAO E COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "341";
			}
		}else if(campos[4].contains("ADOLFO e")) {
			if(csvFile.contains("GUSTAVO")) {
				return "365";
			}
		}else if(campos[4].contains("ALELO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "521";
			}
		}else if(campos[4].contains("ASAAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "364";
			}
		}else if(campos[4].contains("ASSOCIACAO") ||  campos[4].contains("CAMARA DE") || campos[4].contains("CDL CAMARA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "362";
			}
		}else if(campos[4].contains("CENTRAL DOS GAN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4272";
			}
		}else if(campos[4].contains("DANTE A")) {
			if(csvFile.contains("GUSTAVO")) {
				return "540";
			}
		}else if(campos[4].contains("ENERGISA ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "354";
			}
		}else if(campos[4].contains("GUSTAVO WANDERLEY")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4542";
			}
		}else if(campos[4].contains("HOTLINK ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "364";
			}
		}else if(campos[4].contains("HUMANA ASSISTENCIA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "339";
			}
		}else if(campos[4].contains("IMD COM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6635";
			}
		}else if(campos[4].contains("IUGU")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4437";
			}
		}else if(campos[4].contains("E.M. SOLU")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4437";
			}
		}else if(campos[4].contains("RMCC")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4478";
			}
		}else if(campos[4].contains("J.P ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1003";
			}
		}else if(campos[4].contains("JJI ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1748";
			}
		}else if(campos[4].contains("KIKI")) {
			if(csvFile.contains("GUSTAVO")) {
				return "540";
			}
		}else if(campos[4].contains("INTERMEDICA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "364";
			}
		}else if(campos[4].contains("CRIATIVA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "893";
			}else if(csvFile.contains("VALFREDO")) {
				return "1620";
			}
		}else if(campos[4].contains("FLORAPLAC")) {
			if(csvFile.contains("GUSTAVO")) {
				return "897";
			}else if(csvFile.contains("VALFREDO")) {
				return "1627";
			}
		}else if(campos[4].contains("ARCHI ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "912";
			}else if(csvFile.contains("VALFREDO")) {
				return "1374";
			}
		}else if(campos[4].contains("METAL SHOW")) {
			if(csvFile.contains("GUSTAVO")) {
				return "930";
			}else if(csvFile.contains("VALFREDO")) {
				return "1603";
			}
		}else if(campos[4].contains("MAKSIWA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "935";}
		}else if(campos[4].contains("LEITZ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "940";
			}else if(csvFile.contains("VALFREDO")) {
				return "1609";
			}
		}else if(campos[4].contains("LINX")) {
			if(csvFile.contains("GUSTAVO")) {
				return "364";
			}
		}else if(campos[4].contains("MAGAZINE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4103";
			}
		}else if(campos[4].contains("LARTECNICA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "942";
			}else if(csvFile.contains("VALFREDO")) {
				return "4202";
			}
		}else if(campos[4].contains("LARFORT")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4176";
			}
		}else if(campos[4].contains("FORT FERRO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9601";
			}
		}else if(campos[4].contains("JAS COM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "953";
			}else if(csvFile.contains("VALFREDO")) {
				return "983";
			}
		}else if(campos[4].contains("HENKEL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "957";
			}else if(csvFile.contains("VALFREDO")) {
				return "1559";
			}
		}else if(campos[4].contains("FORMILINE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "960";
			}else if(csvFile.contains("VALFREDO")) {
				return "1003";
			}
		}else if(campos[4].contains("FGVTN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "962";
			}else if(csvFile.contains("VALFREDO")) {
				return "1356";
			}
		}else if(campos[4].contains("EUCATEX")) {
			if(csvFile.contains("GUSTAVO")) {
				return "965";
			}else if(csvFile.contains("VALFREDO")) {
				return "1633";
			}
		}else if(campos[4].contains("MASUTTI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "972";}
		}else if(campos[4].contains("SAYERLACK")) {
			if(csvFile.contains("GUSTAVO")) {
				return "985";
			}else if(csvFile.contains("VALFREDO")) {
				return "950";
			}
		}else if(campos[4].contains("JAMAD")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9037";
			}else if(csvFile.contains("ALFREDO")) {
			return "985";}
		}else if(campos[4].contains("PERFIL ROLDANAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "987";
			}else if(csvFile.contains("VALFREDO")) {
				return "1307";
			}
		}else if(campos[4].contains("ORDENARE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "988";
			}else if(csvFile.contains("VALFREDO")) {
				return "2458";
			}
		}else if(campos[4].contains("LDB LOG")) {
			if(csvFile.contains("GUSTAVO")) {
			return "996";}
		}else if(campos[4].contains("ACB SEGURAN")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9133";}
		}else if(campos[4].contains("A P G TRANS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9195";}
		}else if(campos[4].contains("SUDATI PAI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9196";}
		}else if(campos[4].contains("TECMAR TRA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9278";}
		}else if(campos[4].contains("D M S COMER")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9307";}
		}else if(campos[4].contains("MISS TRANS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9317";}
		}else if(campos[4].contains("LAUDANS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9318";}
		}else if(campos[4].contains("TRUCKAO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9350";}
		}else if(campos[4].contains("FABIO DIAS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9372";}
		}else if(campos[4].contains("JAGUAR MATERI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9373";}
		}else if(campos[4].contains("CELESTE ALIM")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9405";}
		}else if(campos[4].contains("TRANSOLIVEIRA LOGI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9453";}
		}else if(campos[4].contains("E ZALMA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9485";}
		}else if(campos[4].contains("RODONAVES")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9514";}
		}else if(campos[4].contains("PAPIC PAP")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9515";}
		}else if(campos[4].contains("METANA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9804";
			}
		}else if(campos[4].contains("REDE SIM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9869";
			}
		}else if(campos[4].contains("DANTAS E LIMA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9950";
			}
		}else if(campos[4].contains("CHARLENE FERREIRA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9951";
			}
		}else if(campos[4].contains("I RAMOS B")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9983";
			}
		}else if(campos[4].contains("MARIA CLARA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9881";
			}
		}else if(campos[4].contains("PATRK IN")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9109";}
		}else if(campos[4].contains("LOJA DO CONDOMINIO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9551";}
		}else if(campos[4].contains("ARAUJO COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9552";}
		}else if(campos[4].contains("INFOTECK COM")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9554";}
		}else if(campos[4].contains("JMA COMDE")) {
			if(csvFile.contains("GUSTAVO")) {
			return "9600";}
		}else if(campos[4].contains("PAUMA (")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1003";
			}else if(csvFile.contains("VALFREDO")) {
				return "1837";
			}
		}else if(campos[4].contains("METALURGICA MS ABC")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1005";}
		}else if(campos[4].contains("INDASA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1006";
			}else if(csvFile.contains("VALFREDO")) {
				return "2088";
			}
		}else if(campos[4].contains("FURNAX COMER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1007";
			}else if(csvFile.contains("VALFREDO")) {
				return "2604";
			}
		}else if(campos[4].contains("BIGFER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1022";
			}else if(csvFile.contains("VALFREDO")) {
				return "723";
			}
		}else if(campos[4].contains("ARTETILICA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1023";}
		}else if(campos[4].contains("BOSCH")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1032";
			}else if(csvFile.contains("VALFREDO")) {
				return "623";
			}
		}else if(campos[4].contains("DE TONI")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1037";
			}else if(csvFile.contains("VALFREDO")) {
				return "1602";
			}
		}else if(campos[4].contains("KILLING S")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1044";
			}else if(csvFile.contains("VALFREDO")) {
				return "662";
			}
		}else if(campos[4].contains("ALMATA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1061";
			}else if(csvFile.contains("VALFREDO")) {
				return "725";
			}
		}else if(campos[4].contains("BAUNGARTEN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1061";
			}
		}else if(campos[4].contains("RFC ALUMINIOS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1070";
			}else if(csvFile.contains("VALFREDO")) {
				return "2121";
			}
		}else if(campos[4].contains("PERFINOBRE ALU")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1072";
			}else if(csvFile.contains("VALFREDO")) {
				return "2022";
			}
		}else if(campos[4].contains("QUIMY")) {
			if(csvFile.contains("GUSTAVO")) {
				return "572";
			}
		}else if(campos[4].contains("ITALY LIN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1080";
			}else if(csvFile.contains("VALFREDO")) {
				return "1554";
			}
		}else if(campos[4].contains("CAVANIH COM")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1090";}
		}else if(campos[4].contains("TEMART")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1100";
			}else if(csvFile.contains("VALFREDO")) {
				return "943";
			}
		}else if(campos[4].contains("PLACAS DO BRASIL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1103";
			}else if(csvFile.contains("VALFREDO")) {
				return "1598";
			}
		}else if(campos[4].contains("IMD COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1109";
			}else if(csvFile.contains("VALFREDO")) {
				return "2858";
			}
		}else if(campos[4].contains("R3 COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1220";
			}
		}else if(campos[4].contains("SOPRANO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3517";
			}else if(csvFile.contains("VALFREDO")) {
				return "3396";
			}
		}else if(campos[4].contains("LARTECNICA (REF")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1137";}//
		}else if(campos[4].contains("ANCE-AIR")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1168";
			}else if(csvFile.contains("VALFREDO")) {
				return "1028";
			}
		}else if(campos[4].contains("JOSEANO G")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1225";}
		}else if(campos[4].contains("YURI RAYAN")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1229";}
		}else if(campos[4].contains("MARIA JOSE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9602";}
			else if(csvFile.contains("VALFREDO")) {
			return "1315";}
		}else if(campos[4].contains("LATORRE TR")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1348";}
		}else if(campos[4].contains("JOSE EUSTAQUIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9752";
			}
		}else if(campos[4].contains("CTBC ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "356";
			}
		}else if(campos[4].contains("AUTO MOLAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9604";
			}
		}else if(campos[4].contains("AUTO EQUIPADORA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9633";
			}
		}else if(campos[4].contains("P R DE A")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9666";
			} 
		}else if(campos[4].contains("J A DE ARAUJO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9668";
			} 
		}else if(campos[4].contains("J A D TRANSPO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9999";
			}
		}else if(campos[4].contains("PATEO COMER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "10092";
			}
		}else if(campos[4].contains("LINS COM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9697";
			}
		}else if(campos[4].contains("COOPERATIVA DE TRANSPORTE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9750";
			}
		}else if(campos[4].contains("ROSEMBERG")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9751";
			}
		}else if(campos[4].contains("QUALIMAX DO BRASIL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "9802";
			}
		}else if(campos[4].contains("PINTO BARBOSA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1448";
			}
		}else if(campos[4].contains("ARAUCO INDUSTRIA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1405";
			}else if(csvFile.contains("VALFREDO")) {
				return "732";
			}
		}else if(campos[4].contains("ARAUCO DO BRASIL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "705";
			}
		}else if(campos[4].contains("SAMPAIO LEITE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "847";
			}
		}else if(campos[4].contains("BRITO E BARB")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8072";
			}
		}else if(campos[4].contains("SISTEMAQ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8108";
			}
		}else if(campos[4].contains("BRN SOLUCOES")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8393";
			}
		}else if(campos[4].contains("VAREJAO DO OLEO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8552";
			}
		}else if(campos[4].contains("CARLOS ALBERTO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8945";
			}
		}else if(campos[4].contains("F J C DOS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "8950";
			}
		}else if(campos[4].contains("INDUSTRIA DE PLASTICOS E ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7971";
			}
		}else if(campos[4].contains("SAMPAIO LEITE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "849";
			}
		}else if(campos[4].contains("METALSUL COM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1473";
			}else if(csvFile.contains("VALFREDO")) {
				return "1537";
			}
		}else if(campos[4].contains("RODILINE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1481";
			}else if(csvFile.contains("VALFREDO")) {
				return "1365";
			}
		}else if(campos[4].contains("INMES")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7077";
			}else if(csvFile.contains("VALFREDO")) {
				return "3037";
			}
		}else if(campos[4].contains("TT INDUSTRIA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6719";
			}
		}else if(campos[4].contains("L E E MATERIAL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7247";
			}
		}else if(campos[4].contains("TURBO FREIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7460";
			}
		}else if(campos[4].contains("FILETTO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4357";
			}else if(csvFile.contains("VALFREDO")) {
			return "1564";}
		}else if(campos[4].contains("FERRARI(CA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1566";}
		}else if(campos[4].contains("SULPEN ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1576";
			}else if(csvFile.contains("VALFREDO")) {
				return "2832";
			}
		}else if(campos[4].contains("M PLACAS E REV")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1582";}
		}else if(campos[4].contains("DETONI(M")) {
			if(csvFile.contains("VALFREDO")) {
			return "1602";}
		}else if(campos[4].contains("MINUBRAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1606";
			}else if(csvFile.contains("VALFREDO")) {
				return "3085";
			}
		}else if(campos[4].contains("EPOXIGLASS")) {
			if(csvFile.contains("VALFREDO")) {
			return "1635";}
		}else if(campos[4].contains("ROSA COMP")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1686";
			}else if(csvFile.contains("VALFREDO")) {
				return "1301";
			}
		}else if(campos[4].contains("SCHULZ")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1739";
			}else if(csvFile.contains("VALFREDO")) {
				return "2013";
			}
		}else if(campos[4].contains("LAMIECCO PLA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1746";
			}else if(csvFile.contains("VALFREDO")) {
				return "1978";
			}
		}else if(campos[4].contains("METALNOX (JJ")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1748";}
		}else if(campos[4].contains("FONTOLAN -")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1809";
			}else if(csvFile.contains("VALFREDO")) {
				return "3168";
			}
		}else if(campos[4].contains("PERTECH")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1821";
			}else if(csvFile.contains("VALFREDO")) {
				return "3017";
			}
		}else if(campos[4].contains("ISOPRENE")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1828";}
		}else if(campos[4].contains("ALCIDES PE")) {
			if(csvFile.contains("VALFREDO")) {
			return "1872";}
		}else if(campos[4].contains("MARAJA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "1843";
			}else if(csvFile.contains("VALFREDO")) {
				return "3064";
			}
		}else if(campos[4].contains("RAUBER")) {
			if(csvFile.contains("GUSTAVO")) {
			return "1851";}
		}else if(campos[4].contains("CAICARA ART")) {
			if(csvFile.contains("VALFREDO")) {
			return "2710";}
		}else if(campos[4].contains("W.M.")) {
			if(csvFile.contains("VALFREDO")) {
			return "2710";}
		}else if(campos[4].contains("UNIMETAIS")) {
			if(csvFile.contains("VALFREDO")) {
			return "2830";}
		}else if(campos[4].contains("A. VALERIA")) {
			if(csvFile.contains("VALFREDO")) {
			return "2942";}
		}else if(campos[4].contains("UNIAO (CO")) {
			if(csvFile.contains("VALFREDO")) {
			return "2942";}
		}else if(campos[4].contains("PNEU'S SH")) {
			if(csvFile.contains("VALFREDO")) {
			return "2957";}
		}else if(campos[4].contains("LIVRARIA PROG")) {
			if(csvFile.contains("VALFREDO")) {
			return "3117";}
		}else if(campos[4].contains("THERON")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4373";
			}else if(csvFile.contains("VALFREDO")) {
			return "3148";}
		}else if(campos[4].contains("CIELO S/A")) {
			if(csvFile.contains("VALFREDO")) {
			return "3393";}
		}else if(campos[4].contains("BELENUS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3407";}
		}else if(campos[4].contains("DOMINIO SI")) {
			if(csvFile.contains("VALFREDO")) {
			return "3433";}
		}else if(campos[4].contains("DECO FORM")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3515";
			}else if(csvFile.contains("VALFREDO")) {
				return "715";
			}
		}else if(campos[4].contains("SP ALUMINIO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3552";}
		}else if(campos[4].contains("TRANSPORTE CABANO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3572";}
		}else if(campos[4].contains("TRANSPORTES ARI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "7482";}
		}else if(campos[4].contains("TRANSPORTADORA GUANAMBI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "7483";}
		}else if(campos[4].contains("MB LAMIN")) {
			if(csvFile.contains("VALFREDO")) {
			return "3601";}
		}else if(campos[4].contains("CALCADOS CRIVA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3586";
			}else if(csvFile.contains("VALFREDO")) {
				return "2616";
			}
		}else if(campos[4].contains("ACO BRAZIL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3748";
			}
		}else if(campos[4].contains("L A DE QUEI")) {
			if(csvFile.contains("VALFREDO")) {
			return "3603";}
		}else if(campos[4].contains("THERMO PRIN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3639";
			}else if(csvFile.contains("VALFREDO")) {
				return "3696";
			}
		}else if(campos[4].contains("TXS TRANSPOR")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3703";}
		}else if(campos[4].contains("FERREIRA COSTA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3774";}
		}else if(campos[4].contains("I J V TENORIO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3794";}
		}else if(campos[4].contains("CAERN - ")) {
			if(csvFile.contains("VALFREDO")) {
			return "3774";}
		}else if(campos[4].contains("ALGAR ") || campos[4].contains("BRISANET") || campos[4].contains("TELEMAR - OI")) {
			if(csvFile.contains("VALFREDO")) {
				return "3775";
			}else if(csvFile.contains("GUSTAVO")) {
				return "558";
			}
		}else if(campos[4].contains("CLARO") || campos[4].contains("OI S A") ) {
			if(csvFile.contains("GUSTAVO")) {
			return "356";}
		}else if(campos[4].contains("CAGEPA") || campos[4].contains("COMPESA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "355";}
		}else if(campos[4].contains("ALLYSON STHEPHEN")) {
			if(csvFile.contains("GUSTAVO")) {
			return "357";}
		}else if(campos[4].contains("CM PRODUTOS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "6553";}
		}else if(campos[4].contains("F CAMARA DA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "6429";}
		}else if(campos[4].contains("Nilson Da Cruz")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4548";}
		}else if(campos[4].contains("Maria Estela")) {
			if(csvFile.contains("GUSTAVO")) {
			return "6429";}
		}else if(campos[4].contains("Arlei Dos Santos")) {
			if(csvFile.contains("GUSTAVO")) {
			return "312";}
		}else if(campos[4].contains("ELIELSON SIL")) {
			if(csvFile.contains("GUSTAVO")) {
			return "559";}
		}else if(campos[4].contains("Jaqueline Alves")) {
			if(csvFile.contains("GUSTAVO")) {
			return "559";}
		}else if(campos[4].contains("RONIVALDO SOUZA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "341";}
		}else if(campos[4].contains("PAULO BRAS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "341";}
		}else if(campos[4].contains("PULSES SERVIC")) {
			if(csvFile.contains("GUSTAVO")) {
			return "357";}
		}else if(campos[4].contains("UNIAO COMERCI")) {
			if(csvFile.contains("GUSTAVO")) {
			return "559";}
		}else if(campos[4].contains("LUCAS RODRIGUE")) {
			if(csvFile.contains("GUSTAVO")) {
			return "364";}
		}else if(campos[4].contains("ROGACIANO N NO")) {
			if(csvFile.contains("GUSTAVO")) {
			return "341";}
		}else if(campos[4].contains("WAWS COMUNICAC")) {
			if(csvFile.contains("GUSTAVO")) {
			return "540";}
		}else if(campos[4].contains("PAULO RAFAEL S")) {
			if(csvFile.contains("GUSTAVO")) {
			return "365";}
		}else if(campos[4].contains("ARTKAMIZETAS L")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4316";}
		}else if(campos[4].contains("RENATO T Y")) {
			if(csvFile.contains("GUSTAVO")) {
			return "364";}
		}else if(campos[4].contains("FRANCISCO DE A")) {
			if(csvFile.contains("GUSTAVO")) {
			return "341";}
		}else if(campos[4].contains("DANIEL M L M")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4544";}
		}else if(campos[4].contains("W P GRAFICA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "540";}
		}else if(campos[4].contains("Tar Cust�dia") || campos[4].contains("Tarifa") || campos[4].contains("Tar Dep�s") 
				|| campos[4].contains("Tar Pag S")) {
			if(csvFile.contains("GUSTAVO")) {
			return "373";}
		}else if(campos[4].contains("MATANA (LI")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3884";
			}else if(csvFile.contains("VALFREDO")) {
				return "3665";
			}
		}else if(campos[4].contains("KALIPSO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3886";
			}else if(csvFile.contains("VALFREDO")) {
				return "974";
			}
		}else if(campos[4].contains("HAFELE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3891";
			}else if(csvFile.contains("VALFREDO")) {
				return "3922";
			}
		}else if(campos[4].contains("AMAURI A")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3940";
			}else if(csvFile.contains("VALFREDO")) {
				return "4126";
			}
		}else if(campos[4].contains("WIRUTEX")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3943";
			}else if(csvFile.contains("VALFREDO")) {
				return "3229";
			}
		}else if(campos[4].contains("ASF COMERCIO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "3984";
			}
		}else if(campos[4].contains("cart�o") && campos[4].contains("EMPRESARIAL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4272";
			}
		}else if(campos[4].contains("MBLOG (MAX")) {
			if(csvFile.contains("GUSTAVO")) {
			return "3944";}
		}else if(campos[4].contains("JOWAT DO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4006";
			}else if(csvFile.contains("VALFREDO")) {
				return "4146";
			}
		}else if(campos[4].contains("PNEUBRAS C")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4028";}
		}else if(campos[4].contains("ARPREX (EQ")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4083";}
		}else if(campos[4].contains("RENDICOLLA")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4149";}
		}else if(campos[4].contains("H. SANTOS")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4154";}
		}else if(campos[4].contains("MAXIMA FER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4168";
			}else if(csvFile.contains("VALFREDO")) {
				return "4260";
			}
		}else if(campos[4].contains("MARCIANO T")) {
			if(csvFile.contains("GUSTAVO")) {
			return "4171";}
		}else if(campos[4].contains("GROSSL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4181";
			}else if(csvFile.contains("VALFREDO")) {
				return "2860";
			}
		}else if(campos[4].contains("SAINTGOBAIN")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4241";
			}
		}else if(campos[4].contains("CERMAG")) {
			if(csvFile.contains("GUSTAVO")) {
				return "4261";
			}
		}else if(campos[4].contains("ALFANI")) {
			if(csvFile.contains("VALFREDO")) {
				return "4309";
			}else if(csvFile.contains("GUSTAVO")) {
				return "4272";
			}
		}else if(campos[4].contains("SCM GROUP")) {
			if(csvFile.contains("VALFREDO")) {
			return "4340";}
		}else if(campos[4].contains("FITEC ")) {
			if(csvFile.contains("VALFREDO")) {
			return "4453";}
		}else if(campos[4].contains("SAINT-GOBAIN")) {
			if(csvFile.contains("VALFREDO")) {
			return "4465";}
		}else if(campos[4].contains("QUADRILATERO")) {
			if(csvFile.contains("VALFREDO")) {
			return "4508";}
		}else if(campos[4].contains("BASE COMPO")) {
			if(csvFile.contains("VALFREDO")) {
			return "4526";}
		}else if(campos[4].contains("MADEIREIRA BROCAR")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6756";
			}else if(csvFile.contains("VALFREDO")) {
			return "4545";}
		}else if(campos[4].contains("GADELHA E")) {
			if(csvFile.contains("VALFREDO")) {
			return "4609";}
		}else if(campos[4].contains("ALTERNATIVA")) {
			if(csvFile.contains("VALFREDO")) {
				return "4624";
			}else if(csvFile.contains("GUSTAVO")) {
				return "4620";
			}
		}else if(campos[4].contains("VALFREDO E BARBOSAS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "608";
			}
		}else if(campos[4].contains("ARAMADOS JOMER")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6279";
			}
		}else if(campos[4].contains("DISFA DISTRIBUIDORA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6298";
			}
		}else if(campos[4].contains("FREZITE")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6380";
			}
		}else if(campos[4].contains("GIBEN DO BRASIL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6418";
			}
		}else if(campos[4].contains("ETIQUETAS GUARARAPES")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6549";
			}
		}else if(campos[4].contains("GUARARAPES PAINEIS")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7490";
			}
		}else if(campos[4].contains("SBJP RES")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7533";
			}
		}else if(campos[4].contains("GAMA DIES")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7547";
			}
		}else if(campos[4].contains("SERGIO TALA")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7558";
			}
		}else if(campos[4].contains("JACY SOUT")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7747";
			}
		}else if(campos[4].contains("PG PRIME")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7768";
			}
		}else if(campos[4].contains("ARMAZEM CORAL")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6549";
			}
		}else if(campos[4].contains("EDUARDO FAUSTINO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7825";
			}
		}else if(campos[4].contains("UNIGRAFICA EDITO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "7912";
			}
		}else if(campos[4].contains("VIA VAREJO")) {
			if(csvFile.contains("GUSTAVO")) {
				return "6661";
			}
		}else if(campos[4].contains("JOMER")) {
			if(csvFile.contains("VALFREDO")) {
			return "4722";}
		}
		return "";
	}
		
}

public class StringUtility {
	public String replaceWhiteSpaces(String oldName) {
	
		oldName = oldName.replaceAll("\\s", "");

		return oldName;
	}

	public String replaceNameOfNumbersWithDigits(String oldName){
		oldName = oldName.replaceAll(" [Z|z][E|e][R|r][O|o]" , " 0").replaceAll(" [O|o][N|n][E|e]" , " 1").replaceAll(" [T|t][W|w][O|o]" , " 2")
						 .replaceAll(" [T|t][H|h][R|r][E|e][E|e]" , " 3").replaceAll(" [F|f][O|o][U|u][R|r]" , " 4").replaceAll(" [F|f][I|i][V|v][E|e]" , " 5")
						 .replaceAll(" [S|s][I|i][X|x]" , " 6").replaceAll(" [S|s][E|e][V|v][E|e][N|n]" , " 7").replaceAll(" [E|e][I|i][G|g][H|h][T|t]" , " 8")
						 .replaceAll(" [N|n][I|i][N|n][E|e]" , " 9");

		return oldName;
	}
}
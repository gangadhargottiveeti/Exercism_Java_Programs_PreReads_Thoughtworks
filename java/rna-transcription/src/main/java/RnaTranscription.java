class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();

        for(int index=0; index < dnaStrand.length(); index++){
            char presentCharacter = dnaStrand.charAt(index);

            switch (presentCharacter){
                case 'G':
                    result.append('C');
                    break;
                case 'C':
                    result.append("G");
                    break;
                case 'T':
                    result.append("A");
                    break;
                case 'A':
                    result.append("U");
                    break;
                default:
                    result.append(presentCharacter);
                    break;
            }
        }
        return result.toString();
    }

}

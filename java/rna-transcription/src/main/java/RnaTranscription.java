class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i < dnaStrand.length(); i++){
            char c = dnaStrand.charAt(i);

            switch (c){
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
                    result.append(c);
                    break;
            }
        }
        return result.toString();
    }

}

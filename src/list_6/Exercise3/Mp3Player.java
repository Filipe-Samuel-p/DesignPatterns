package list_6.Exercise3;

class Mp3Player implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}

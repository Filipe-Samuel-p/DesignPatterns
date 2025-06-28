package list_6.Exercise3;

class Mp4Adapter implements MediaPlayer {
    private Mp3Player mp3Player = new Mp3Player();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Converting mp4 to mp3...");
            mp3Player.play("mp3", fileName.replace(".mp4", ".mp3"));
        } else {
            mp3Player.play(audioType, fileName);
        }
    }
}
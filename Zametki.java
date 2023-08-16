import java.time.LocalDate;

public class Zametki {
    private String type;
    private String owner;
    private String title;
    private String coverColor;
    private LocalDate creationDate;
    private boolean archived;
    private String pageSize;
    private String privacySetting;

    public Zametki(String type, String owner, String title, String coverColor, LocalDate creationDate,
                   boolean archived, String pageSize, String privacySetting) {
        this.type = type;
        this.owner = owner;
        this.title = title;
        this.coverColor = coverColor;
        this.creationDate = creationDate;
        this.archived = archived;
        this.pageSize = pageSize;
        this.privacySetting = privacySetting;
    }
    public Zametki (){

    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void archiveNote() {
        setArchived(true);
        System.out.println("Note has been archived.");
    }

    public void unarchiveNote() {
        setArchived(false);
        System.out.println("Note has been unarchived.");
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    @Override
    public String toString() {
        return "Zametki{" +
                "type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", title='" + title + '\'' +
                ", coverColor='" + coverColor + '\'' +
                ", creationDate=" + creationDate +
                ", archived=" + archived +
                ", pageSize='" + pageSize + '\'' +
                ", privacySetting='" + privacySetting + '\'' +
                '}';
    }
}

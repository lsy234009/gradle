import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DownloadPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getExtenions().create("download", DownloadExtension.class);
    }
}

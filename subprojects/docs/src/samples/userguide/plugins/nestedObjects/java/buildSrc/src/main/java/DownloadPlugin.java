import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DownloadPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.getExtenions().create("download", DownloadExtension.class);
    }
}

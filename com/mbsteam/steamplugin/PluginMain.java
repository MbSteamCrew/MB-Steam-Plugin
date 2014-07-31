import java.util.logging.Level;
import com.mbserver.api.MBServerPlugin;
import com.mbserver.api.Manifest;

@Manifest( name = "MbSteamPlugin", authors = "MBSteamCrew")

public class PluginMain extends MBServerPlugin {

    @Override
    public void onEnable() {
    
        this.getLogger().info("Thanks for using the MbSteamPlugin by the MBSteamCrew!")
    
      }
    @Override
    public void onDisable() {
    
        this.getLogger().info("Have a nice day!")
    
    }
    
}

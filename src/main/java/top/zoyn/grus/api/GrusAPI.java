package top.zoyn.grus.api;

import top.zoyn.grus.Grus;
import top.zoyn.grus.manager.BoundaryExpDropManager;
import top.zoyn.grus.manager.BoundaryManager;
import top.zoyn.grus.manager.LanguageManager;
import top.zoyn.grus.manager.LingemManager;

public class GrusAPI {

    /**
     * 获取 语言管理器
     *
     * @return {@link LanguageManager}
     */
    public static LanguageManager getLanguageManager() {
        return Grus.getInstance().getLanguageManager();
    }

    /**
     * 获取 境界管理器
     *
     * @return {@link BoundaryManager}
     */
    public static BoundaryManager getBoundaryManager() {
        return Grus.getInstance().getBoundaryManager();
    }

    /**
     * 获取 境界经验值掉落管理器
     *
     * @return {@link BoundaryExpDropManager}
     */
    public static BoundaryExpDropManager getBoundaryExpDropManager() {
        return Grus.getInstance().getBoundaryExpDropManager();
    }


    /**
     * 获取 灵根管理器
     *
     * @return {@link LingemManager}
     */
    public static LingemManager getLingemManager() {
        return Grus.getInstance().getLingemManager();
    }

}

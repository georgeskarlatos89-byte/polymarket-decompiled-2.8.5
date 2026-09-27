package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rkk {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}

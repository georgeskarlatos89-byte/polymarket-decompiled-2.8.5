package defpackage;

import bo.app.f5;
import bo.app.yg;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ hl1(File file, int i) {
        this.a = i;
        this.b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        File file = this.b;
        switch (i) {
            case 0:
                return "Deleting shared prefs file at: " + file.getAbsolutePath();
            case 1:
                return "Could not recursively delete " + file.getName();
            case 2:
                return "Cannot delete SharedPreferences that does not exist. Path: " + file.getAbsolutePath();
            case 3:
                return "SharedPreferences file is expected to end in .xml. Path: " + file.getAbsolutePath();
            case 4:
                return "Retrieving image from local path: " + file.getAbsolutePath();
            case 5:
                return file;
            case 6:
                return "Failed to delete DataStore file after 3 attempts: " + file.getName();
            case 7:
                synchronized (m08.d) {
                    m08.c.remove(file.getAbsolutePath());
                }
                return Unit.INSTANCE;
            case 8:
                return f5.a(file);
            case 9:
                return yg.c(file);
            default:
                return yg.b(file);
        }
    }
}

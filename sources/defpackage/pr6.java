package defpackage;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class pr6 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile()) {
            if (!Intrinsics.areEqual(file.getName(), "events.log")) {
                String name = file.getName();
                name.getClass();
                if (e.u(name, "events-", false)) {
                    String name2 = file.getName();
                    name2.getClass();
                    if (e.n(name2, ".log", false)) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

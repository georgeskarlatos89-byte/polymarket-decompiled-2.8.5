package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl1 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        str.getClass();
        if (!e.u(str, "persistent", false)) {
            if (!e.u(str, "com.appboy", false) || Intrinsics.areEqual(str, "com.appboy.override.configuration.cache")) {
                if (e.u(str, "com.braze", false) && !Intrinsics.areEqual(str, "com.braze.override.configuration.cache")) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class sd0 {
    public static final HashSet d = new HashSet();
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public sd0(String str, String str2) {
        this.a = str;
        this.b = str2;
        d.add(this);
    }

    public boolean a() {
        HashSet hashSet = rd0.a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd0(String str, String str2, int i) {
        this(str, str2);
        this.c = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sd0(String str) {
        this("IMPLEMENTATION_ONLY_FEATURE", str);
        this.c = 3;
    }
}

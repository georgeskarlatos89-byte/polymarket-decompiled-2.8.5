package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zr8 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = u1k.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(bfc bfcVar) {
        int i = 0;
        while (true) {
            zec[] zecVarArr = bfcVar.a;
            if (i < zecVarArr.length) {
                zec zecVar = zecVarArr[i];
                if (zecVar instanceof nh4) {
                    nh4 nh4Var = (nh4) zecVar;
                    if ("iTunSMPB".equals(nh4Var.c) && a(nh4Var.d)) {
                        return;
                    }
                } else if (zecVar instanceof y5a) {
                    y5a y5aVar = (y5a) zecVar;
                    if ("com.apple.iTunes".equals(y5aVar.b) && "iTunSMPB".equals(y5aVar.c) && a(y5aVar.d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}

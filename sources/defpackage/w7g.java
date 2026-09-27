package defpackage;

import com.polymarket.designtokens.Icon;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class w7g {
    public final Icon a;
    public final int b;
    public final Function0 c;

    public w7g(Icon icon, int i, Function0 function0) {
        icon.getClass();
        function0.getClass();
        this.a = icon;
        this.b = i;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w7g) {
            w7g w7gVar = (w7g) obj;
            if (this.a == w7gVar.a && this.b == w7gVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}

package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class f9b {
    public final String a;
    public final String b;
    public final e9b c;
    public final ArrayList d;

    public f9b(String str, String str2, e9b e9bVar, ArrayList arrayList) {
        str.getClass();
        e9bVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = e9bVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f9b) {
                f9b f9bVar = (f9b) obj;
                if (!Intrinsics.areEqual(this.a, f9bVar.a) || !Intrinsics.areEqual(this.b, f9bVar.b) || this.c != f9bVar.c || !Intrinsics.areEqual(this.d, f9bVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("LineupTeamUi(name=", this.a, ", formation=", this.b, ", side=");
        r.append(this.c);
        r.append(", players=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}

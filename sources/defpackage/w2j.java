package defpackage;

import com.polymarket.data.EGameTimeline;
import com.polymarket.data.ESportsTeam;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class w2j implements y2j {
    public final String a;
    public final EGameTimeline b;
    public final ESportsTeam c;
    public final ESportsTeam d;

    public w2j(String str, EGameTimeline eGameTimeline, ESportsTeam eSportsTeam, ESportsTeam eSportsTeam2) {
        str.getClass();
        this.a = str;
        this.b = eGameTimeline;
        this.c = eSportsTeam;
        this.d = eSportsTeam2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w2j) {
                w2j w2jVar = (w2j) obj;
                if (!Intrinsics.areEqual(this.a, w2jVar.a) || !Intrinsics.areEqual(this.b, w2jVar.b) || !Intrinsics.areEqual(this.c, w2jVar.c) || !Intrinsics.areEqual(this.d, w2jVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.y2j
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        ESportsTeam eSportsTeam = this.c;
        if (eSportsTeam == null) {
            hashCode = 0;
        } else {
            hashCode = eSportsTeam.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ESportsTeam eSportsTeam2 = this.d;
        if (eSportsTeam2 != null) {
            i = eSportsTeam2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Marker(id=" + this.a + ", timeline=" + this.b + ", homeTeam=" + this.c + ", awayTeam=" + this.d + ")";
    }
}

package defpackage;

import com.polymarket.data.EHomePageMarketingCampaign;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class b79 implements d79 {
    public final EHomePageMarketingCampaign a;
    public final List b;

    public b79(EHomePageMarketingCampaign eHomePageMarketingCampaign, List list) {
        list.getClass();
        this.a = eHomePageMarketingCampaign;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b79) {
                b79 b79Var = (b79) obj;
                if (!Intrinsics.areEqual(this.a, b79Var.a) || !Intrinsics.areEqual(this.b, b79Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SquadsHero(campaign=" + this.a + ", spotlightTeams=" + this.b + ")";
    }
}

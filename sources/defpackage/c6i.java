package defpackage;

import android.view.View;
import android.widget.ScrollView;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c6i implements y8k {
    public final ScrollView a;
    public final BrandZoneView b;
    public final ChallengeZoneView c;
    public final InformationZoneView d;

    public c6i(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.a = scrollView;
        this.b = brandZoneView;
        this.c = challengeZoneView;
        this.d = informationZoneView;
    }

    @Override // defpackage.y8k
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.net.Uri;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ui8 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public ui8(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public ui8(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = i3;
    }
}

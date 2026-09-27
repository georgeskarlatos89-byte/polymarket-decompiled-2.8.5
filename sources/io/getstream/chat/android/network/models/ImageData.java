package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/network/models/ImageData;", "", "", "frames", "height", "size", "url", "width", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/network/models/ImageData;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ImageData {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ImageData(@zca(name = "frames") String str, @zca(name = "height") String str2, @zca(name = "size") String str3, @zca(name = "url") String str4, @zca(name = "width") String str5) {
        k84.p(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final ImageData copy(@zca(name = "frames") String frames, @zca(name = "height") String height, @zca(name = "size") String size, @zca(name = "url") String url, @zca(name = "width") String width) {
        frames.getClass();
        height.getClass();
        size.getClass();
        url.getClass();
        width.getClass();
        return new ImageData(frames, height, size, url, width);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) obj;
        if (Intrinsics.areEqual(this.a, imageData.a) && Intrinsics.areEqual(this.b, imageData.b) && Intrinsics.areEqual(this.c, imageData.c) && Intrinsics.areEqual(this.d, imageData.d) && Intrinsics.areEqual(this.e, imageData.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder r = m51.r("ImageData(frames=", this.a, ", height=", this.b, ", size=");
        k84.q(r, this.c, ", url=", this.d, ", width=");
        return woa.r(r, this.e, ")");
    }
}

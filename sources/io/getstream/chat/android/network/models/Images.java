package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/network/models/Images;", "", "Lio/getstream/chat/android/network/models/ImageData;", "fixedHeight", "fixedHeightDownsampled", "fixedHeightStill", "fixedWidth", "fixedWidthDownsampled", "fixedWidthStill", "original", "<init>", "(Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;)V", "copy", "(Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;Lio/getstream/chat/android/network/models/ImageData;)Lio/getstream/chat/android/network/models/Images;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class Images {
    public final ImageData a;
    public final ImageData b;
    public final ImageData c;
    public final ImageData d;
    public final ImageData e;
    public final ImageData f;
    public final ImageData g;

    public Images(@zca(name = "fixed_height") ImageData imageData, @zca(name = "fixed_height_downsampled") ImageData imageData2, @zca(name = "fixed_height_still") ImageData imageData3, @zca(name = "fixed_width") ImageData imageData4, @zca(name = "fixed_width_downsampled") ImageData imageData5, @zca(name = "fixed_width_still") ImageData imageData6, @zca(name = "original") ImageData imageData7) {
        imageData.getClass();
        imageData2.getClass();
        imageData3.getClass();
        imageData4.getClass();
        imageData5.getClass();
        imageData6.getClass();
        imageData7.getClass();
        this.a = imageData;
        this.b = imageData2;
        this.c = imageData3;
        this.d = imageData4;
        this.e = imageData5;
        this.f = imageData6;
        this.g = imageData7;
    }

    public final Images copy(@zca(name = "fixed_height") ImageData fixedHeight, @zca(name = "fixed_height_downsampled") ImageData fixedHeightDownsampled, @zca(name = "fixed_height_still") ImageData fixedHeightStill, @zca(name = "fixed_width") ImageData fixedWidth, @zca(name = "fixed_width_downsampled") ImageData fixedWidthDownsampled, @zca(name = "fixed_width_still") ImageData fixedWidthStill, @zca(name = "original") ImageData original) {
        fixedHeight.getClass();
        fixedHeightDownsampled.getClass();
        fixedHeightStill.getClass();
        fixedWidth.getClass();
        fixedWidthDownsampled.getClass();
        fixedWidthStill.getClass();
        original.getClass();
        return new Images(fixedHeight, fixedHeightDownsampled, fixedHeightStill, fixedWidth, fixedWidthDownsampled, fixedWidthStill, original);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Images)) {
            return false;
        }
        Images images = (Images) obj;
        if (Intrinsics.areEqual(this.a, images.a) && Intrinsics.areEqual(this.b, images.b) && Intrinsics.areEqual(this.c, images.c) && Intrinsics.areEqual(this.d, images.d) && Intrinsics.areEqual(this.e, images.e) && Intrinsics.areEqual(this.f, images.f) && Intrinsics.areEqual(this.g, images.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Images(fixedHeight=" + this.a + ", fixedHeightDownsampled=" + this.b + ", fixedHeightStill=" + this.c + ", fixedWidth=" + this.d + ", fixedWidthDownsampled=" + this.e + ", fixedWidthStill=" + this.f + ", original=" + this.g + ")";
    }
}

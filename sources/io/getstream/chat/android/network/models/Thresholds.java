package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/Thresholds;", "", "Lio/getstream/chat/android/network/models/LabelThresholds;", "explicit", "spam", "toxic", "<init>", "(Lio/getstream/chat/android/network/models/LabelThresholds;Lio/getstream/chat/android/network/models/LabelThresholds;Lio/getstream/chat/android/network/models/LabelThresholds;)V", "copy", "(Lio/getstream/chat/android/network/models/LabelThresholds;Lio/getstream/chat/android/network/models/LabelThresholds;Lio/getstream/chat/android/network/models/LabelThresholds;)Lio/getstream/chat/android/network/models/Thresholds;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class Thresholds {
    public final LabelThresholds a;
    public final LabelThresholds b;
    public final LabelThresholds c;

    public /* synthetic */ Thresholds(LabelThresholds labelThresholds, LabelThresholds labelThresholds2, LabelThresholds labelThresholds3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : labelThresholds, (i & 2) != 0 ? null : labelThresholds2, (i & 4) != 0 ? null : labelThresholds3);
    }

    public final Thresholds copy(@zca(name = "explicit") LabelThresholds explicit, @zca(name = "spam") LabelThresholds spam, @zca(name = "toxic") LabelThresholds toxic) {
        return new Thresholds(explicit, spam, toxic);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thresholds)) {
            return false;
        }
        Thresholds thresholds = (Thresholds) obj;
        if (Intrinsics.areEqual(this.a, thresholds.a) && Intrinsics.areEqual(this.b, thresholds.b) && Intrinsics.areEqual(this.c, thresholds.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        LabelThresholds labelThresholds = this.a;
        if (labelThresholds == null) {
            hashCode = 0;
        } else {
            hashCode = labelThresholds.hashCode();
        }
        int i2 = hashCode * 31;
        LabelThresholds labelThresholds2 = this.b;
        if (labelThresholds2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = labelThresholds2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        LabelThresholds labelThresholds3 = this.c;
        if (labelThresholds3 != null) {
            i = labelThresholds3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "Thresholds(explicit=" + this.a + ", spam=" + this.b + ", toxic=" + this.c + ")";
    }

    public Thresholds(@zca(name = "explicit") LabelThresholds labelThresholds, @zca(name = "spam") LabelThresholds labelThresholds2, @zca(name = "toxic") LabelThresholds labelThresholds3) {
        this.a = labelThresholds;
        this.b = labelThresholds2;
        this.c = labelThresholds3;
    }
}

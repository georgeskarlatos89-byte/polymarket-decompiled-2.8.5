package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/getstream/chat/android/network/models/LabelThresholds;", "", "", "block", "flag", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lio/getstream/chat/android/network/models/LabelThresholds;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class LabelThresholds {
    public final Float a;
    public final Float b;

    public /* synthetic */ LabelThresholds(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }

    public final LabelThresholds copy(@zca(name = "block") Float block, @zca(name = "flag") Float flag) {
        return new LabelThresholds(block, flag);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelThresholds)) {
            return false;
        }
        LabelThresholds labelThresholds = (LabelThresholds) obj;
        if (Intrinsics.areEqual(this.a, labelThresholds.a) && Intrinsics.areEqual(this.b, labelThresholds.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Float f = this.a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = hashCode * 31;
        Float f2 = this.b;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "LabelThresholds(block=" + this.a + ", flag=" + this.b + ")";
    }

    public LabelThresholds(@zca(name = "block") Float f, @zca(name = "flag") Float f2) {
        this.a = f;
        this.b = f2;
    }
}

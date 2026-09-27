package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/PollOptionInput;", "", "", "text", "", "custom", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/network/models/PollOptionInput;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PollOptionInput {
    public final String a;
    public final Map b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollOptionInput(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map);
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final PollOptionInput copy(@zca(name = "text") String text, @zca(name = "custom") Map<String, ? extends Object> custom) {
        return new PollOptionInput(text, custom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionInput)) {
            return false;
        }
        PollOptionInput pollOptionInput = (PollOptionInput) obj;
        if (Intrinsics.areEqual(this.a, pollOptionInput.a) && Intrinsics.areEqual(this.b, pollOptionInput.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "PollOptionInput(text=" + this.a + ", custom=" + this.b + ")";
    }

    public PollOptionInput(@zca(name = "text") String str, @zca(name = "custom") Map<String, ? extends Object> map) {
        this.a = str;
        this.b = map;
    }
}

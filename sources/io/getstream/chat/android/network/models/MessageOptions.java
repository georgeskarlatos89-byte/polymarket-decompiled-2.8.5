package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/MessageOptions;", "", "", "includeThreadParticipants", "", "", "memberCustomInclude", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/chat/android/network/models/MessageOptions;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MessageOptions {
    public final Boolean a;
    public final List b;

    public /* synthetic */ MessageOptions(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final MessageOptions copy(@zca(name = "include_thread_participants") Boolean includeThreadParticipants, @zca(name = "member_custom_include") List<String> memberCustomInclude) {
        return new MessageOptions(includeThreadParticipants, memberCustomInclude);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageOptions)) {
            return false;
        }
        MessageOptions messageOptions = (MessageOptions) obj;
        if (Intrinsics.areEqual(this.a, messageOptions.a) && Intrinsics.areEqual(this.b, messageOptions.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "MessageOptions(includeThreadParticipants=" + this.a + ", memberCustomInclude=" + this.b + ")";
    }

    public MessageOptions(@zca(name = "include_thread_participants") Boolean bool, @zca(name = "member_custom_include") List<String> list) {
        this.a = bool;
        this.b = list;
    }
}

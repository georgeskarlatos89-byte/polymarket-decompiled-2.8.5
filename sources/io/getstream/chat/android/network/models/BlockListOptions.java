package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import defpackage.zf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/BlockListOptions;", "", "Lzf1;", "behavior", "", "blocklist", "<init>", "(Lzf1;Ljava/lang/String;)V", "copy", "(Lzf1;Ljava/lang/String;)Lio/getstream/chat/android/network/models/BlockListOptions;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class BlockListOptions {
    public final zf1 a;
    public final String b;

    public BlockListOptions(@zca(name = "behavior") zf1 zf1Var, @zca(name = "blocklist") String str) {
        zf1Var.getClass();
        str.getClass();
        this.a = zf1Var;
        this.b = str;
    }

    public final BlockListOptions copy(@zca(name = "behavior") zf1 behavior, @zca(name = "blocklist") String blocklist) {
        behavior.getClass();
        blocklist.getClass();
        return new BlockListOptions(behavior, blocklist);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockListOptions)) {
            return false;
        }
        BlockListOptions blockListOptions = (BlockListOptions) obj;
        if (Intrinsics.areEqual(this.a, blockListOptions.a) && Intrinsics.areEqual(this.b, blockListOptions.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockListOptions(behavior=" + this.a + ", blocklist=" + this.b + ")";
    }
}

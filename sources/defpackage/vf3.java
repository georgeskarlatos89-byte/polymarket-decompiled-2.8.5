package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.models.SyncStatus;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChannelDao_Impl b;
    public final /* synthetic */ SyncStatus c;
    public final /* synthetic */ int d;

    public /* synthetic */ vf3(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i, int i2) {
        this.a = i2;
        this.b = channelDao_Impl;
        this.c = syncStatus;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.d;
        SyncStatus syncStatus = this.c;
        ChannelDao_Impl channelDao_Impl = this.b;
        fcg fcgVar = (fcg) obj;
        switch (i) {
            case 0:
                return ChannelDao_Impl.d(channelDao_Impl, syncStatus, i2, fcgVar);
            default:
                return ChannelDao_Impl.a(channelDao_Impl, syncStatus, i2, fcgVar);
        }
    }
}

package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChannelConfigDao_Impl b;
    public final /* synthetic */ List c;

    public /* synthetic */ bf3(ChannelConfigDao_Impl channelConfigDao_Impl, List list, int i) {
        this.a = i;
        this.b = channelConfigDao_Impl;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        ChannelConfigDao_Impl channelConfigDao_Impl = this.b;
        fcg fcgVar = (fcg) obj;
        switch (i) {
            case 0:
                return ChannelConfigDao_Impl.g(channelConfigDao_Impl, list, fcgVar);
            default:
                return ChannelConfigDao_Impl.h(channelConfigDao_Impl, list, fcgVar);
        }
    }
}

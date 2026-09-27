package defpackage;

import com.polymarket.clients.ClientChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class aq3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;

    public /* synthetic */ aq3(int i, qqc qqcVar) {
        this.a = i;
        this.b = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        qqc qqcVar = this.b;
        switch (i) {
            case 0:
                ClientChatMessage clientChatMessage = (ClientChatMessage) obj;
                clientChatMessage.getClass();
                qqcVar.setValue(clientChatMessage);
                return Unit.INSTANCE;
            default:
                ClientChatMessage clientChatMessage2 = (ClientChatMessage) obj;
                clientChatMessage2.getClass();
                qqcVar.setValue(clientChatMessage2);
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import com.polymarket.clients.ClientChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zp3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClientChatMessage b;
    public final /* synthetic */ qqc c;

    public /* synthetic */ zp3(ClientChatMessage clientChatMessage, qqc qqcVar, int i) {
        this.a = i;
        this.b = clientChatMessage;
        this.c = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ClientChatMessage clientChatMessage = this.b;
        qqc qqcVar = this.c;
        switch (i) {
            case 0:
                qqcVar.setValue(clientChatMessage);
                return Unit.INSTANCE;
            case 1:
                qqcVar.setValue(clientChatMessage);
                return Unit.INSTANCE;
            case 2:
                qqcVar.setValue(clientChatMessage);
                return Unit.INSTANCE;
            default:
                qqcVar.setValue(clientChatMessage);
                return Unit.INSTANCE;
        }
    }
}

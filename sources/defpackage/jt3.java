package defpackage;

import com.polymarket.clients.ClientChatPositionAttachment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jt3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ClientChatPositionAttachment c;

    public /* synthetic */ jt3(Function1 function1, ClientChatPositionAttachment clientChatPositionAttachment, int i) {
        this.a = i;
        this.b = function1;
        this.c = clientChatPositionAttachment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ClientChatPositionAttachment clientChatPositionAttachment = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(clientChatPositionAttachment);
                return Unit.INSTANCE;
            default:
                function1.invoke(clientChatPositionAttachment);
                return Unit.INSTANCE;
        }
    }
}

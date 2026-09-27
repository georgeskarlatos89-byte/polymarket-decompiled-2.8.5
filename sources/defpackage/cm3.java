package defpackage;

import com.polymarket.clients.ChatClientError;
import kotlin.Metadata;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcm3;", "Lc64;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class cm3 extends c64 {
    public final ChatClientError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm3(ChatClientError chatClientError, String str) {
        super(chatClientError, str, null);
        chatClientError.getClass();
        this.b = chatClientError;
    }

    @Override // defpackage.c64
    /* renamed from: a */
    public final SwiftProjecting getA() {
        return this.b;
    }
}

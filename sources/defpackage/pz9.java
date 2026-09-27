package defpackage;

import com.checkout.components.insight.data.dto.Events;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lpz9;", "", "", "contentType", "publicKey", "ckoServiceName", "ckoServiceVersion", "Lcom/checkout/components/insight/data/dto/Events;", "body", "Ly4g;", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Events;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface pz9 {
    @ppd("/v1/insights")
    Object a(@y49("Content-Type") String str, @y49("Authorization") String str2, @y49("Cko-Service-Name") String str3, @y49("Cko-Service-Version") String str4, @ug1 Events events, Continuation<? super y4g<Unit>> continuation);
}

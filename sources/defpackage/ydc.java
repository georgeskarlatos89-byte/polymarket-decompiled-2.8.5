package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface ydc {
    Object deleteAll(Continuation continuation);

    Object deleteByMessageIds(List list, Continuation continuation);

    Object selectAll(int i, Continuation continuation);

    Object upsert(List list, Continuation continuation);
}

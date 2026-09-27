package defpackage;

import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface uf3 {
    Object delete(String str, Continuation continuation);

    Object deleteAll(Continuation continuation);

    Object insert(zf3 zf3Var, Continuation continuation);

    Object insertMany(List list, Continuation continuation);

    Object select(String str, Continuation continuation);

    Object select(List list, Continuation continuation);

    Object selectCidsBySyncNeeded(SyncStatus syncStatus, int i, Continuation continuation);

    Object setDeletedAt(String str, Date date, Continuation continuation);
}

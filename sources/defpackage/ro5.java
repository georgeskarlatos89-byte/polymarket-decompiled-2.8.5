package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ro5 {
    Object cleanUp(Continuation continuation);

    Object migrate(Object obj, Continuation continuation);

    Object shouldMigrate(Object obj, Continuation continuation);
}

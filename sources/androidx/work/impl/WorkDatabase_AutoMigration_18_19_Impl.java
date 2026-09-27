package androidx.work.impl;

import defpackage.dgc;
import defpackage.sci;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
class WorkDatabase_AutoMigration_18_19_Impl extends dgc {
    public WorkDatabase_AutoMigration_18_19_Impl() {
        super(18, 19);
    }

    @Override // defpackage.dgc
    public void migrate(sci sciVar) {
        sciVar.t("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}

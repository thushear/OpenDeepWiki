package com.koalawiki.domains.warehouse;

public class WarehouseInRole {
    private String warehouseId;
    private String roleId;
    private boolean isReadOnly;
    private boolean isWrite;
    private boolean isDelete;

    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public String getRoleId() { return roleId; }
    public void setRoleId(String roleId) { this.roleId = roleId; }
    public boolean isReadOnly() { return isReadOnly; }
    public void setReadOnly(boolean readOnly) { isReadOnly = readOnly; }
    public boolean isWrite() { return isWrite; }
    public void setWrite(boolean write) { isWrite = write; }
    public boolean isDelete() { return isDelete; }
    public void setDelete(boolean delete) { isDelete = delete; }
}

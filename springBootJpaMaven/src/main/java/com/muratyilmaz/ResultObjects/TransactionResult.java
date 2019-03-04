package com.muratyilmaz.ResultObjects;

import java.time.Instant;

import com.muratyilmaz.CustomException.MyException;

public class TransactionResult<T> {

	private boolean success;

	private TransactionError error;

	private T data;

	private Instant createTime;

	public TransactionResult() {
		this.success = true;
		this.data = null;
		this.error = null;
		this.createTime = Instant.now();
	}

	public TransactionResult(T data) {
		this.success = true;
		this.data = data;
		this.error = null;
		this.createTime = Instant.now();
	}

	public TransactionResult(MyException error) {
		this.error = new TransactionError();
		this.error.setErrorName(error.getTitle());
		this.error.setErrorCode(error.getErrorCode());
		this.error.setErrorMessage(error.getMessage());
		this.error.setHttpStatusCode(error.getHttpStatusCode());
		this.success = false;
		this.data = null;
		this.createTime = Instant.now();
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public TransactionError getError() {
		return error;
	}

	public void setError(TransactionError error) {
		this.error = error;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Instant getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Instant createTime) {
		this.createTime = createTime;
	}
}

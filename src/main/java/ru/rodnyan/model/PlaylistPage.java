package ru.rodnyan.model;

public class PlaylistPage {
	private Playlist[] items;
	private String href;
	private int limit;
	private String next;
	private int offset;
	private String previous;
	private int total;

	public Playlist[] getItems() {
		return items;
	}

	public void setItems(Playlist[] items) {
		this.items = items;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}

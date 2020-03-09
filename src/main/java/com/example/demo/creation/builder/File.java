package com.example.demo.creation.builder;

public class File {
	private String name;
	private String type;
	private String url;
	private String lastMotifile;

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setLastMotifile(String lastMotifile) {
		this.lastMotifile = lastMotifile;
	}

	@Override
	public String toString() {
		return "File{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", url='" + url + '\'' +
				", lastMotifile='" + lastMotifile + '\'' +
				'}';
	}

	public static class FileBuilder{
		private File file = new File();

		public FileBuilder setName(String name) {
			file.setName(name);
			return this;
		}

		public FileBuilder setType(String type) {
			file.setType(type);
			return this;
		}

		public FileBuilder setUrl(String url) {
			file.setUrl(url);
			return this;
		}

		public FileBuilder setLastMotifile(String lastMotifile) {
			file.setLastMotifile(lastMotifile);
			return this;
		}

		public File build(){
			return file;
		}
	}
}
